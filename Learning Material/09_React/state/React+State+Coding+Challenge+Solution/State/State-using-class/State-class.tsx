import { Component } from "react";
import Navigation from "./Navigation";
import Block from "./Block";

// Step 1 : Extend the class with Component
class State extends Component{
    // Step 2 : use default state object which handles the initial value
    state ={
        comp : <Navigation />
    }
    
    // Step 3 : function handles default setState method
    change = () =>{

        // Step 4 : Use default setSate() function as shown below
        //          This function takes another function return type or object return type as parameter
        this.setState(abc => { return {comp : <Block name={"John"} email={"john@gmail.com"}/>} });
        
        //  or

        // this.setState( {comp : "!!! Have a Dream which never let's you sleep !!!"} );

        // This will not work
        // this.setState( "!!! Have a Dream which never let's you sleep !!!" );
        console.log(this.state.comp)
    }

    render() {

        return(
            <>
                <h2>{this.state.comp}</h2>
                <button onClick={this.change}>Change Component</button>
            </>
        )
    }
}

export default State;