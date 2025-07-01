import React, { useState } from 'react';

// TaskList component to manage a list of tasks
const TaskList: React.FC = () => {
    const [tasks, setTasks] = useState<string[]>([]); // State to store the list of tasks
    const [task, setTask] = useState(''); // State to store the current input value

    // Function to add a new task to the list
    const addTask = () => {
        if (task.trim()) {
            // Ensure the task is not empty or just whitespace
            setTasks([...tasks, task.trim()]); // Add the new task to the list
            setTask(''); // Reset the input field
        }
    };

    // Function to remove a task by its index
    const removeTask = (index: number) => setTasks(tasks.filter((_, i) => i !== index));

    return (
        <div className="bg-gray-700 p-4 rounded shadow-md">
            {/* Header for the task list */}
            <h3 className="text-lg font-semibold text-white mb-4">Tasks</h3>

            {/* Input and Add Task Button */}
            <div className="mb-4">
                {/* Input field to add a new task */}
                <input
                    type="text"
                    placeholder="Add a task" // Placeholder text for the input
                    value={task} // Controlled input value
                    onChange={(e) => setTask(e.target.value)} // Update input value on change
                    className="w-full p-2 rounded bg-gray-800 text-white mb-2"
                />
                {/* Button to add the task */}
                <button className="w-full bg-purple-600 text-white py-2 rounded" onClick={addTask}>
                    Add Task
                </button>
            </div>

            {/* Display the list of tasks */}
            <ul className="space-y-2">
                {tasks.map((task, index) => (
                    <li key={index} className="flex justify-between items-center bg-gray-800 p-2 rounded">
                        {/* Display the task */}
                        <span className="text-white">{task}</span>
                        {/* Remove button for the task */}
                        <button onClick={() => removeTask(index)} className="text-red-500">
                            Remove
                        </button>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default TaskList; // Export the TaskList component
