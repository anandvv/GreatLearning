const quizQuestions = `
[
    {
        "question": "What is the capital of India?",
        "answerChoices": ["Mumbai", "Bangalore", "New Delhi", "Calcutta"],
        "answerKey": 2
    },
    {
        "question": "What is the capital of Brazil?",
        "answerChoices": ["Rio de Janeiro", "Sao Paolo", "Porto Alegre", "Brasilia"],
        "answerKey": 3
    },
    {
        "question": "What is the capital of Italy?",
        "answerChoices": ["Rome", "Milan", "Bologna", "Florence"],
        "answerKey": 0
    },
    {
        "question": "What is the capital of Pakistan?",
        "answerChoices": ["Hyderabad", "Karachi", "Lahore", "Rawalpindi"],
        "answerKey": 1
    },
    {
        "question": "What is the capital of China?",
        "answerChoices": ["Beijing", "Shanghai", "Wuxi", "Shenzhen"],
        "answerKey": 0
    },
    {
        "question": "What is the capital of Australia?",
        "answerChoices": ["Sydney", "Melbourne", "Canberra", "Perth"],
        "answerKey": 2
    },
    {
        "question": "What is the capital of Argentina?",
        "answerChoices": ["Salta", "Rosario", "Mendonza", "Buenos Aires"],
        "answerKey": 3
    },
    {
        "question": "What is the capital of England?",
        "answerChoices": ["Birmingham", "Liverpool", "London", "Manchester"],
        "answerKey": 2
    },
    {
        "question": "What is the capital of France?",
        "answerChoices": ["Nice", "Paris", "Marseille", "Lyon"],
        "answerKey": 1
    },
    {
        "question": "What is tha capital of Portugal",
        "answerChoices": ["Porto", "Coimbra", "Braga", "Lisbon"],
        "answerKey": 3
    }
]
`;

var arrQuestions = JSON.parse(quizQuestions);
var score = 0;

// console.log(arrQuestions);

function getNewQuestion(){
    if(arrQuestions.length > 0)
        return arrQuestions.shift();
    else return null;
}

function computeScore(question, givenAnswer){
    if(question.answerChoices[givenAnswer] === question["answerKey"]){
        score++;
    }
}

function displayQuestion(){
    const newQuestion = getNewQuestion();
    document.getElementById("question").innerHTML = newQuestion.question;
    document.getElementById("answerChoice0").innerHTML = newQuestion.answerChoices[0];
    document.getElementById("answerChoice1").innerHTML = newQuestion.answerChoices[1];
    document.getElementById("answerChoice2").innerHTML = newQuestion.answerChoices[2];
    document.getElementById("answerChoice3").innerHTML = newQuestion.answerChoices[3];
}

window.onload = displayQuestion;


