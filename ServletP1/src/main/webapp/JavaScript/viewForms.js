
class ReimbursementPojo {
    constructor(RID, userName, fullName, theDate, eventStartDate, theLocation, description, theCost, gradingFormat, passingPercentage, eventType, reason, fileName, status) {
        //Reimbursement ID
        this.RID = RID;
        this.userName = userName;
        this.fullName = fullName;
        this.theDate = theDate;
        this.eventStartDate = eventStartDate;
        this.theLocation = theLocation;
        this.description = description;
        this.theCost = theCost;
        this.gradingFormat = gradingFormat;
        this.passingPercentage = passingPercentage;
        this.eventType = eventType;
        this.reason = reason;
        this.fileName = fileName;
        this.status = status;
    }
}

//let testf = new ReimbursementPojo("RID", "userName", "fullName", "theDate", "eventStartDate", "theLocation", "description", "theCost", "gradingFormat", "passingPercentage", "eventType", "reason", "fileName", "status");
function createFormsList(forms) {

    let increment = 0;

    //let tables = new document.getElementById("tables");

    //action="viewOwnedForms.html" 
    
    //newTable.setAttribute("id", ("Form # " + increment));

    // let list = document.getElementById("retrievalInfo");
    
    // list.innerHTML="";
    
    for (f of forms) {
        // let item = document.createElement("li");
        // item.innerHTML = f.userName;
        // list.appendChild(item);

        let newTable = document.createElement(("Form # " + increment));
        let row = newTable.insertRow(0);

        
        let cell0 = row.insertCell(0);
        let cell1 = row.insertCell(1);
        let cell2 = row.insertCell(2);
        let cell3 = row.insertCell(3);
        let cell4 = row.insertCell(4);
        let cell5 = row.insertCell(5);
        let cell6 = row.insertCell(6);
        let cell7 = row.insertCell(7);
        let cell8 = row.insertCell(8);
        let cell9 = row.insertCell(9);
        let cell10 = row.insertCell(10);
        let cell11 = row.insertCell(11);
        let cell12 = row.insertCell(12);
        let cell13 = row.insertCell(13);

        cell0.innerHTML = f.RID;
        cell1.innerHTML = f.userName;
        cell2.innerHTML = f.fullName;
        cell3.innerHTML = f.theDate;
        cell4.innerHTML = f.eventStartDate;
        cell5.innerHTML = f.theLocation;
        cell6.innerHTML = f.description;
        cell7.innerHTML = f.theCost;
        cell8.innerHTML = f.gradingFormat;
        cell9.innerHTML = f.passingPercentage;
        cell10.innerHTML = f.eventType;
        cell11.innerHTML = f.reason;
        cell12.innerHTML = f.fileName;
        cell13.innerHTML = f.status;

        increment++;
    }

}

function getAllForms() {

    console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                createFormsList(JSON.parse(xhr.responseText));
            } else {
                document.getElementById("retrievalInfo").innerHTML = "Failed to retireve forms";
            }
        } else {
            document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "viewOwnedForms", true);
    xhr.send();

    //Redirect
    //window.location = "http://localhost:8080/viewOwnedForms.html";
}
