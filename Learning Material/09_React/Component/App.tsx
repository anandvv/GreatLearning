import Component from "./Component";
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
      <Component course={courses[0]}/>
      <hr />
      <Component course={courses[1]}/>
    </>
  );
}

export default App;