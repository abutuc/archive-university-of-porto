import React from 'react';
import { NavLink } from 'react-router-dom';
import { FiHome, FiGrid, FiSettings, FiFileText } from 'react-icons/fi';
import logo from '/src/assets/hm-logo.png';

// Props for the Sidebar component
interface SidebarProps {
    isCollapsed: boolean; // Determines if the sidebar is collapsed or expanded
    toggleSidebar: () => void; // Function to toggle the sidebar state
}

// Sidebar component providing navigation and collapsible functionality
const Sidebar: React.FC<SidebarProps> = ({ isCollapsed, toggleSidebar }) => {
    // Array defining the menu items, including name, icon, and navigation link
    const menuItems = [
        { name: 'Home', icon: <FiHome />, link: '/' },
        { name: 'Devices', icon: <FiGrid />, link: '/devices' },
        { name: 'Rules', icon: <FiFileText />, link: '/rules' },
    ];

    return (
        // Main sidebar container with dynamic width based on collapse state
        <nav
            className={`h-full flex flex-col transition-all duration-300 ease-in-out bg-background rounded-r-3xl ${
                isCollapsed ? 'w-16' : 'w-64'
            } `}
        >
            {/* Sidebar header with branding and toggle button */}
            <div className="p-base flex flex-col items-center justify-between space-y-base">
                {/* Logo with scale animation */}
                <img
                    className={`object-contain transition-transform duration-300 ${
                        isCollapsed ? 'scale-0' : 'scale-100'
                    }`}
                    src={logo}
                    alt="Logo"
                />

                {/* Toggle button to collapse or expand the sidebar */}
                <button
                    onClick={toggleSidebar}
                    className={`cursor-pointer text-2xl transform transition-transform duration-300 ${
                        isCollapsed ? 'rotate-0' : 'rotate-180'
                    } text-text`}
                >
                    ☰
                </button>
            </div>

            {/* Sidebar menu items */}
            <ul className="space-y-m mt-base">
                {menuItems.map((item, index) => (
                    <li key={index}>
                        {/* NavLink for each menu item with active route highlighting */}
                        <NavLink
                            to={item.link}
                            end
                            className={({ isActive }) =>
                                `w-full flex items-center py-s px-base rounded-soft transition-colors duration-200 ease-in-out ${
                                    isActive
                                        ? 'bg-primary text-white'
                                        : 'hover:bg-secondary'
                                }`
                            }
                        >
                            {/* Icon with a slight zoom animation on hover */}
                            <div
                                className={`text-xl transition-transform duration-200 ease-in-out ${
                                    isCollapsed ? 'mx-auto' : 'ml-0'
                                }`}
                            >
                                {item.icon}
                            </div>

                            {/* Text slide-in animation based on collapse state */}
                            <span
                                className={`ml-base whitespace-nowrap transform transition-transform duration-300 ${
                                    isCollapsed ? '-translate-x-10 opacity-0' : 'translate-x-0 opacity-100'
                                }`}
                            >
                                {item.name}
                            </span>
                        </NavLink>
                    </li>
                ))}
            </ul>
        </nav>
    );
};

export default Sidebar;