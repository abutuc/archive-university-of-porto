import React, {useState} from 'react';
import Sidebar from '../components/Sidebar'; // Import the Sidebar component
import {Outlet} from "react-router-dom"; // Import the Table component for displaying device data

// Dashboard component that manages the layout of the page, including the sidebar and main content
const Dashboard: React.FC = () => {
    // State to manage the collapsed/expanded state of the sidebar
    const [isSidebarCollapsed, setSidebarCollapsed] = useState(false);

    return (
        <div className="flex h-screen w-screen bg-secbackground">
            {/* Sidebar component, passing collapsed state and toggle function */}
            <Sidebar
                isCollapsed={isSidebarCollapsed} // Pass the current collapsed state to Sidebar
                toggleSidebar={() => setSidebarCollapsed((prev) => !prev)} // Toggle the collapsed state
            />
            {/* Main content area */}
            <main className="p-6 flex-1 overflow-auto bg-secbackground">
                <Outlet/>
            </main>
        </div>
    );
};

export default Dashboard; // Export the Dashboard component for use in other parts of the app
