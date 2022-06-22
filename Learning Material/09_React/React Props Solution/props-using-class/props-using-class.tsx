import { Component } from "react"

// step 1 : create object which holds data type
type GettingValue = {
  Name: string
}

// step 2: pass the object in class
class Employee extends Component<GettingValue> {

    render(){
      // step 3 : access the data
      // const {Name} = this.props
      return (
        <div>
          <h2>Employee Details...</h2>
          <p>
            <label>Name : <b>{this.props.Name}</b></label>
          </p>
        </div>
        )
    }
}
export default Employee