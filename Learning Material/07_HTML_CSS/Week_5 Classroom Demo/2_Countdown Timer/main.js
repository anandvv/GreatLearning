var secs = 12; 
var flag=false;

function countdown() {
    // this will call the function only once
    if(flag===false)
    {
        Decrement()
        flag=true;
    }
}

function Decrement() { 
    // this will refer <input id="sec" type="text" readonly>  
    seconds = document.getElementById("sec");
    // this will update seconds in <input id="sec" type="text" readonly>
    seconds.value = secs; 

    if (secs < 10) {  
        seconds.style.color = "red";
        seconds.style.fontSize = "60px";
        document.getElementById("msg").innerHTML = "HURRY UP!!"; 
    }

    if (secs < 0) { 
        alert('Timeout');  
        seconds.value = '00';
        document.getElementById("timeBox").innerHTML = "<b>Time's up.</b>";
    }
    else { 
        secs--;
        // we are calling the same method after 1 second
        setTimeout('Decrement()', 1000); 
    } 
}