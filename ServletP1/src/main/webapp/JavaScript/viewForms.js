
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

class RequestsPojo {
    constructor(msg_id, sender_user, rec_user, messages, date_sent) {
        this.msg_id = msg_id;
        this.sender_user = sender_user;
        this.rec_user = rec_user;
        this.messages = messages;
        this.date_sent = date_sent;
    }

}

class FormsStatusPojo {
    constructor(RID_status, manager_status, depthead_status, benco_status) {
        this.RID_status = RID_status;
        this.manager_status = manager_status = manager_status;
        this.depthead_status = depthead_status;
        this.benco_status = benco_status;
    }
}

function createAllStatusList(status) {
    let theTable = document.getElementById("table1");

    for (s of status) {

        let row = theTable.insertRow(1);

        
        let cell0 = row.insertCell(0);
        let cell1 = row.insertCell(1);
        let cell2 = row.insertCell(2);
        let cell3 = row.insertCell(3);
        let cell4 = row.insertCell(4);
        
        cell0.innerHTML = s.msg_id;
        cell1.innerHTML = s.sender_user;
        cell2.innerHTML = s.rec_user;
        cell3.innerHTML = s.messages;
        cell4.innerHTML = s.date_sent; 
    }
}

function createRequestsList(requests) {
    let theTable = document.getElementById("table");

    for (r of requests) {

        let row = theTable.insertRow(1);

        
        let cell0 = row.insertCell(0);
        let cell1 = row.insertCell(1);
        let cell2 = row.insertCell(2);
        let cell3 = row.insertCell(3);
        let cell4 = row.insertCell(4);
        
        cell0.innerHTML = r.msg_id;
        cell1.innerHTML = r.sender_user;
        cell2.innerHTML = r.rec_user;
        cell3.innerHTML = r.messages;
        cell4.innerHTML = r.date_sent; 
    }
}

//let testf = new ReimbursementPojo("RID", "userName", "fullName", "theDate", "eventStartDate", "theLocation", "description", "theCost", "gradingFormat", "passingPercentage", "eventType", "reason", "fileName", "status");
function createFormsList(forms) {

	//let increment = 0;

    //let tables = document.getElementById("retrievalInfo");

    //action="viewOwnedForms.html" 
    
    //newTable.setAttribute("id", ("Form # " + increment));

   //let list = document.getElementById("retrievalInfo");

   let theTable = document.getElementById("table");
    
   //list.innerHTML="";
    
    for (f of forms) {
        
    	/*let item = document.createElement("li");
         item.innerHTML = f.fullName;
         list.appendChild(item);*/

        
        let row = theTable.insertRow(1);

        
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
        
        cell0.innerHTML = f.rid;
        cell1.innerHTML = f.userName;
        cell2.innerHTML = f.fullName;
        cell3.innerHTML = f.theDate.month +"/"+f.theDate.dayOfMonth+"/"+f.theDate.year;
        cell4.innerHTML = f.eventStartDate.month +"/"+ f.eventStartDate.dayOfMonth + "/" + f.eventStartDate.year;
        cell5.innerHTML = f.theLocation;
        cell6.innerHTML = f.description;
        cell7.innerHTML = f.theCost;
        cell8.innerHTML = f.gradingFormat;
        cell9.innerHTML = f.passingPercentage;
        cell10.innerHTML = f.eventType;
        cell11.innerHTML = f.fileName;
        cell12.innerHTML = f.status;
        cell13.innerHTML = f.reason;
        //newTable.appendChild(newTable);
        //list.appendChild(newTable);
        
        //increment++;
    }

}

function getOwnedForms() {

    //console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                createFormsList(JSON.parse(xhr.responseText));
                document.getElementById("retrievalInfo").innerHTML = "Reimbursement forms recieved!";
            } else {
                document.getElementById("retrievalInfo").innerHTML = "Failed to retrieve forms";
            }
        } else {
            document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "ViewForms", true);
    xhr.send();

    //Redirect
    //window.location = "http://localhost:8080/viewOwnedForms.html";
}

function getAllForms() {

    //console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                createFormsList(JSON.parse(xhr.responseText));
                document.getElementById("retrievalInfo").innerHTML = "Reimbursement forms recieved!";
            } else {
                document.getElementById("retrievalInfo").innerHTML = "Failed to retrieve forms";
            }
        } else {
            document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "ViewAllForms", true);
    xhr.send();
}


function getRequests() {

    //console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                createRequestsList(JSON.parse(xhr.responseText));
                document.getElementById("retrievalInfo").innerHTML = "Requests recieved!";
            } else {
                document.getElementById("retrievalInfo").innerHTML = "Failed to retrieve requests";
            }
        } else {
            document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "ViewRequests", true);
    xhr.send();
}


function getAllFormsStatus() {

    //console.log("I was called");

    let xhr = new XMLHttpRequest();


    //this will only run after open is called and the ready state is changed
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                createAllStatusList(JSON.parse(xhr.responseText));
                document.getElementById("retrievalInfo1").innerHTML = "Forms status recieved!";
            } else {
                document.getElementById("retrievalInfo1").innerHTML = "Failed to retrieve forms status";
            }
        } else {
            document.getElementById("retrievalInfo1").innerHTML = "Fetching Request";
        }
    }
    xhr.open("GET", "ViewAllStatus", true);
    xhr.send();
}


// function getMyFormsStatus() {

//     //console.log("I was called");

//     let xhr = new XMLHttpRequest();


//     //this will only run after open is called and the ready state is changed
//     xhr.onreadystatechange = function() {
//         if (xhr.readyState === 4) {
//             if (xhr.status === 200) {
//                 createMyStatusList(JSON.parse(xhr.responseText));
//                 document.getElementById("retrievalInfo").innerHTML = "Forms status recieved!";
//             } else {
//                 document.getElementById("retrievalInfo").innerHTML = "Failed to retrieve forms status";
//             }
//         } else {
//             document.getElementById("retrievalInfo").innerHTML = "Fetching Request";
//         }
//     }
//     xhr.open("GET", "ViewStatus", true);
//     xhr.send();
// }