import React, { useState } from 'react';

function Clock() {
    const [time, setTime] = useState(new Date());
    setTime(new Date());

  return (
    <div>
      <h1>Hello, world!</h1>
      <h2>It is {time.toLocaleTimeString()}.</h2>
    </div>
  );
}

export default Clock;