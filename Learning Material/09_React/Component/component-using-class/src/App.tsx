import MyComponent from "./MyComponent";
function App() {
  let courses = [{
      name: 'ReactJS',
      toc: ["JavaScript refresher", "React Basics", "Components and Props", "State Management"],
      courseNumber: 1
    },
    {
      name: 'AngularJS',
      toc: ["TypeScript refresher", "Angular Basics", "Routes", "State Management"],
      courseNumber: 2
    }];

  return (
    <>
      <h1>Helloo Learners</h1>
      <p>Happy Learning</p>

      <MyComponent course={courses[0]} showCourseNumber={true}/>
      <hr />
      <MyComponent course={courses[1]} showCourseNumber={false}/>
    </>
  );
}

export default App;