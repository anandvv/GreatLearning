import React from 'react';
import * as ReactDOM from 'react-dom/client';

type Props = {

}

type State = {
    Login: boolean,
    Reply: boolean,
    Number: number
}

class App extends React.Component<Props, State> {
    root: any;

    constructor(props: Props){
        super(props);
        this.state = {
            Login: false,
            Reply: false,
            Number: 0
        }

    }


    render(){
        return(
            <>
                <h1>Multiplication tables</h1>
                {
                    this.state.Login && (
                    <>
                        <div id="surveyMessage">Please enter a number</div>
                        <div>
                            <input type="text" onChange={this.setNumber} value={this.state.Number} />
                            <br />
                        </div>
                    </>
                    )
                }
                <div id="displayTable">
                </div>
                
            </>
        );
    }

    setNumber = (e: any) => {
        this.setState({ Reply: true, Number: Number(e.target.value) });

    }

    componentDidMount () {
        console.log("Mounted");
        this.setState({Login: true});
    }

    componentDidUpdate () {
        console.log("componentDidUpdate");
        if(!this.root){
            this.root = ReactDOM.createRoot(document.getElementById('displayTable')!);
        }

        let tableArray = [1,2,3,4,5,6,7,8,9,10];

        const element = 
            tableArray.map((item: number, idx: React.Key) => <li key={idx} value={item*this.state.Number}>{this.state.Number} X {item} = {item*this.state.Number}</li>);

        console.log(element);
        

        const multiplicationTable = React.createElement('div', {},
                                        React.createElement('ul', {}, [...element]) );
        this.root.render(multiplicationTable);    

    }

    componentWillUnmount(){
        console.log("componentWillUnmount");
    }
}

export default App;