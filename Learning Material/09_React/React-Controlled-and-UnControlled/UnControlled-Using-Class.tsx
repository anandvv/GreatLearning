import { ChangeEvent, Component, FormEvent } from "react"

type Props = {}
type State = {
    Fname : string
}
class UnControlled  extends Component<Props, State> {

    state = {
        Fname : "Hellooo"
    }

    updateValue = (event : ChangeEvent<HTMLInputElement>) => {

        const Ename = event.target.name
        const EValue = event.target.value

        this.setState (
            {
                [Ename]: EValue
            } as unknown as Pick<State, keyof State>
        )
        console.log([Ename] +" "+ EValue)
    }
    
    submitHandler = (event : FormEvent<HTMLFormElement>) =>{
        event?.preventDefault()
        console.log(this.state)
    }

    render(){
        const {Fname} = this.state
        return (
            <>
                <form onSubmit={this.submitHandler}>
                    <input type="text"
                        name="Fname"
                        value = {Fname}
                        onChange = {this.updateValue}
                    />
                    {Fname}
                    <button type="submit">Submit</button>
                </form>
            </>
        )
    }
}
export default UnControlled