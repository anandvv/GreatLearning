import React from 'react';

type Props = {

}

type State = {
    Login: boolean,
    Reply: boolean
}

class App extends React.Component<Props, State> {
    constructor(props: Props){
        super(props);
        this.state = {
            Login: false,
            Reply: false
        }
    }


    render(){
        return(
            <>
                <h1>This is a Header</h1>
              
                {
                    this.state.Login && (
                    <>
                        <div id="surveyMessage">Please take the survey</div>
                        <div id="surveyButtons">
                            <button onClick={this.displayMessage}>Yes</button>
                            <button onClick={this.showSurveyMessage}>No</button>
                        </div>
                    </>
                    )
                }
                {
                    this.state.Reply && (
                        <div id="displayMessage">
                            Thanks for taking the survey
                        </div>
                    )
                }
                
            </>
        );
    }

    displayMessage = () => {
        this.setState({
            Login: true,
            Reply: true
        });
    }

    showSurveyMessage = () => {
        this.setState({
            Login: true,
            Reply: false
        });
    }

    componentDidMount () {
        console.log("Mounted");
        setTimeout(this.showSurveyMessage, 2000);
    }
}

export default App;