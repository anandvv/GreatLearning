import ReactDOM from 'react-dom/client';
import { BrowserRouter } from 'react-router-dom';

import App from './App.tsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    //this is needed to start messing around with routes in the remainder of your application
    <BrowserRouter> 
        <App />
    </BrowserRouter>
);
