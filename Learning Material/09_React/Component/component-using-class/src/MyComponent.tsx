import React from "react";

interface CourseProps{
    course: {
        name: string,
        toc: string[]
    },
    children?: React.ReactNode;
}

class MyComponent extends React.Component<CourseProps>{
    
    render(){
        console.log(this.props);
        return(
            <>
                <h2>Welcome to, {this.props.course.name}!</h2>
                <div>
                    <h4>Syllabus</h4>
                    <ul>
                        {this.props.course.toc.map((topic: string, i: number) => <li key={i}>{topic}</li>)}
                    </ul>
                </div>
            </>
        )
    }
    
}
export default MyComponent;