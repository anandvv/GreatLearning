import React, {Component} from 'react';

interface Props{
    count: number,
    children?: React.ReactNode
}

class MyComponent extends Component <Props, any> {

    constructor(props: Props){
        super(props);
        this.state = {
            count: props.count
        };
    }

    incrementCount = () => {
        this.setState({count: this.state.count + 1});
    }

    render(){
        // console.log(this.props.count);
        // console.log(this.state.count);
        return(
            <>
                <h2>Constructor used to set initial values</h2>
                <p>Counter: {this.state.count}</p>
                <button onClick={this.incrementCount}>
                    Click me
                </button>
            </>
        );
    }
}

export default MyComponent;