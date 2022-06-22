interface CourseProps{
    course: {
        name: string,
        toc: string[]
    },
    children?: React.ReactNode;
}


function Component(props: CourseProps) {
    console.log(props);
    return(
        <>
            <h2>Welcome to, {props.course.name}</h2>
            <div>
                <h4>Syllabus</h4>
                <ul>
                    {props.course.toc.map((topic: string, i: number) => <li key={i}>{topic}</li>)}
                </ul>
            </div>
        </>
    )
}

export default Component;