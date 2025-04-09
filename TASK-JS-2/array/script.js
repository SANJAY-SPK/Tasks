const tasks = [
    {
        name:"Complete the HTML tasks",
        isCompleted:true,
        dueDate: "2023-07-12"
    },
    {
        name:"Complete the CSS tasks",
        isCompleted:true,
        dueDate: "2023-07-13"
    },
    {
        name:"Complete the JavaScript tasks",
        isCompleted:false,
        dueDate: "2023-07-14"
    },
    {
        name:"Complete the Java tasks",
        isCompleted:false,
        dueDate: "2023-07-15"
    }
];
  
  function getIncompleteTasks(taskArray) {
    return taskArray.filter(task => !task.isCompleted);
  }
  
  
  const transformedTasks = tasks.map(task => {
    const today = new Date().toISOString().split("T")[0];
    if (task.dueDate && task.dueDate < today) {
      task.name = `[Overdue] ${task.name}`;
    }
    return task;
  });
  

  const totalTasks = tasks.length;
  const completedTasksCount = tasks.filter(task => task.isCompleted).length;
  
  const taskListDiv = document.getElementById("task-list");
  const summaryDiv = document.getElementById("summary");
  
  
  transformedTasks.forEach(task => {
    const taskDiv = document.createElement("div");
    taskDiv.className = `task ${task.isCompleted ? "completed" : ""}`;
    taskDiv.textContent = `${task.name} (Due: ${task.dueDate || "No due date"})`;
    taskListDiv.appendChild(taskDiv);
  });
  
  
  summaryDiv.textContent = `Total Tasks: ${totalTasks}, Completed Tasks: ${completedTasksCount}`;