import MyComponent from "./MyComponent";
function App() {
  let courses = [{
      name: 'ReactJS',
      toc: ["JavaScript refresher", "React Basics", "Components and Props", "State Management"]
    },
    {
      name: 'AngularJS',
      toc: ["TypeScript refresher", "Angular Basics", "Routes", "State Management"]
    }];

  return (
    <>
      <h1>Helloo Learners</h1>
      <p>Happy Learning</p>

      <MyComponent course={courses[0]}/>
      <hr />
      <MyComponent course={courses[1]}/>
    </>
  );
}

export default App;