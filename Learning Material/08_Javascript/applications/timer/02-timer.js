(function(){
    const btnStart = document.getElementById("btn-start");
    const elemTimeRemaining = document.getElementById("time");
    const elemMessage = document.getElementById("message");
    const elemInputNumber = document.getElementById("number");
    const imgStart = document.getElementById("img-start");

    let remainingTime, id;

    function startTimer(){
        remainingTime = parseInt(elemTimeRemaining.value);
        console.log(remainingTime);

        if(id === undefined){
            id = setInterval(function(){
                if(remainingTime === 0){
                    clearInterval(id);
                    id = undefined;
                    elemMessage.style.color = 'initial';
                    elemMessage.style.fontSize = '1em';
                    elemMessage.innerHTML = "Time's up!"
                    return;
                }

                remainingTime--;
                elemMessage.innerHTML = remainingTime;

                if(remainingTime < 10){
                    elemMessage.style.color = 'red';
                    eleMessage.style.fontSize = '1.5em';
                }
            }, 1000);
        }
    };

    btnStart.addEventListener("click", startTimer);
    imgStart.addEventListener("click", startTimer);
})();