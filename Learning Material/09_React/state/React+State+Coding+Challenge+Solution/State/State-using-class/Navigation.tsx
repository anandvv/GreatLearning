import './Navigation.css';

const styling = {
    textAlign: 'center' as const,
    color: 'red',
    fontSize: 50
};

const Navigation = () =>{
    return (
        // <a href='#' style={{...styling}}>Sample</a>
        
        // can pass the link using props below
        <a href='#' className="background">Sample</a>
    );
}

export default Navigation;