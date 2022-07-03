import ReactDOM from 'react-dom/client';

import App from './App.tsx';
import App2 from './App2.tsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <App />
);

setTimeout(() => {
    root.render( <App2 />)
}, 10000);
