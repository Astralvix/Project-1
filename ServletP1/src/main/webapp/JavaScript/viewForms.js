function getAllForms() {

    console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                displayFormsList(JSON.parse(xhr.responseText));
            } else {
                document.getElementById("retrievalInfo").innerHTML = "Failed to retireve forms";
            }
        } else {
            document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "viewOwnedForms", true);
    xhr.send();

    //window.location = "http://localhost:8080/viewOwnedForms.html";
}