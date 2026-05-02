// Wait for the DOM to fully load before attaching event listeners
document.addEventListener('DOMContentLoaded', () => {
    // Get the form element
    const form = document.getElementById('recipe-form');
    
    // Add an event listener for form submission
    form.addEventListener('submit', async function(event) {
        // Prevent the default form submission behavior
        event.preventDefault();

        // Get the values from the form fields
        const vegetables = document.getElementById('vegetables').value.split(',').map(item => item.trim());
        const spices = document.getElementById('spices').value.split(',').map(item => item.trim());
        const equipment = document.getElementById('equipment').value.split(',').map(item => item.trim());

        // Prepare the data to be sent to the backend
        const data = {
            vegetables: vegetables,
            spices: spices,
            equipment: equipment
        };

        try {
            // Send a POST request to the backend API
            const response = await fetch('/api/recipes', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            });

            // Check if the response is successful
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }

            // Parse the JSON response
            const recipes = await response.json();
            const recipeResults = document.getElementById('recipe-results');
            recipeResults.innerHTML = '';

            // Display the recipes
            recipes.forEach(recipe => {
                const recipeDiv = document.createElement('div');
                recipeDiv.classList.add('recipe');
                recipeDiv.innerHTML = `<h3>${recipe.name}</h3><p>${recipe.description}</p>`;
                recipeResults.appendChild(recipeDiv);
            });
        } catch (error) {
            // Handle any errors
            console.error('Error fetching recipes:', error);
            const recipeResults = document.getElementById('recipe-results');
            recipeResults.innerHTML = '<p>Sorry, something went wrong. Please try again later.</p>';
        }
    });
});