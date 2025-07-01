import React from 'react';

// Define the shape of props the Card component expects
interface CardProps {
    title: string; // The title to be displayed at the top of the card
    children: React.ReactNode; // The content to be rendered inside the card
}

// A reusable Card component to display content with a consistent style
const Card: React.FC<CardProps> = ({ title, children }) => {
    return (
        <div className="bg-gray-700 p-4 rounded shadow-md">
            {/* Card title styled with bold text */}
            <h3 className="text-lg font-semibold text-white mb-2">{title}</h3>
            
            {/* Render any child components or content passed to the Card */}
            {children}
        </div>
    );
};

export default Card; // Export the component for use in other parts of the application
