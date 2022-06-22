import ReactDOM from 'react-dom/client';

import Clock from './Clock.tsx';

const root = ReactDOM.createRoot(document.getElementById('root'));

function tick() {
    root.render(<Clock />);
}

setInterval(tick, 1000);
