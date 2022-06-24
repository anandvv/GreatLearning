import { Component, createRef, FormEvent } from "react";


class Controlled extends Component {

    name = createRef<HTMLInputElement>();

    submitHandler = (event : FormEvent<HTMLFormElement>) =>{
        event?.preventDefault()
        console.log(this.name.current?.value)
    }

    render() {
        return(
            <form onSubmit={this.submitHandler}>
                <input type="text"
                    name="fname"
                    ref={this.name}
                    defaultValue = {"New things"}
                />

                <button type="submit">Submit</button>
            </form>
        )
    }
}
export default Controlled