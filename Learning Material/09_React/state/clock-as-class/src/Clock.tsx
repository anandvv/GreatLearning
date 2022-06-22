import React from 'react';

interface Props{

}

class Clock extends React.Component <any, any> {
    timerID: number;

    constructor(props: Props) {
      super(props);
      this.timerID = 0;
      this.state = {date: new Date()};
    }
  
    componentDidMount() {
      this.timerID = window.setInterval(
        () => this.tick(),
        1000
      );
    }
  
    componentWillUnmount() {
      clearInterval(this.timerID);
    }
  
    tick() {
      this.setState({
        date: new Date()
      });
    }
  
    render() {
      return (
        <div>
          <h1>Hello, world!</h1>
          <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
        </div>
      );
    }
  }
  
export default Clock;