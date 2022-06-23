import { useState } from "react";

// const State = () =>{ // or below way
function State() {
    const Quote = "!!! Dont Judge a book by its cover !!!"
    
    // Step 1 : we will use UseState() React hook. 
    //         useState will take one parameter which should be displayed for the first time
    //         The resultant parameters are 1-variable(updateQuote) 2-function/method-name(setQuote)
    const [updateQuote, setQuote] = useState(Quote);
    
    // Step 2 : function declaring useState function/method
    const newQUote = () =>{
        // Step 3 : declare useState function 
        setQuote("!!! Have a Dream which never let's you sleep !!!");
        console.log(updateQuote)
    }

    return (
        <div>
            {/* Step 4 : Initially updateQuote will have Quote value. When clicked on the button,
                it will change to the value set in the useState function */}
            <h2>{updateQuote}</h2>
            <button onClick={newQUote}>New Quote</button>
        </div>
    )
}

export default State;