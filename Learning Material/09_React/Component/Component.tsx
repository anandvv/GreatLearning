function Component(){
    return(
        <>
            <h1>Helloo Learners</h1>
            <h2>Welcome to, {this.props.course.name}</h2>
            <p>Happy Learning</p>
            <div>
                <h4>Syllabus</h4>
                <ul>
                    {this.props.course.toc.map((topic: string, i: number) => <li key={i}>{topic}</li>)}
                </ul>
            </div>
        </>
    )
}

export default Component;