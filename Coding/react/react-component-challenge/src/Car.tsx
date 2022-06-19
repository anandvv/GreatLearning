import React from 'react';

class Car extends React.Component {
    render() {
      const car = (
        <><h2>Hi, I am a Car!</h2><p>lorem ipsum dolor sit amet</p></>
      );
      return car;
    }
}

const el = (
  <Car />
);

export default el;