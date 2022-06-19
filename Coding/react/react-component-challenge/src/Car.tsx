import React from 'react';

class Car extends React.Component {
    render() {
      return (
        <>
          <h2>Hi, I am a Car!</h2>
          <p>lorem ipsum dolor sit amet</p>
        </>
      );
    }
}

const el = (
  <Car />
);

export default el;