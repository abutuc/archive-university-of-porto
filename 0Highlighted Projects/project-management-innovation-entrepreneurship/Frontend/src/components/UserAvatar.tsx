import React from "react";

interface UserAvatarProps {
  name: string;
  size?: "sm" | "md" | "lg";
  className?: string;
}

export const UserAvatar: React.FC<UserAvatarProps> = ({ 
  name, 
  size = "md",
  className 
}) => {
  // Generate a consistent color based on the name
  const getColorFromName = (name: string) => {
    const colors = [
      "bg-brand-500", "bg-success-500", "bg-error-500", 
      "bg-warning-500", "bg-blue-light-500", "bg-orange-500",
      "bg-theme-pink-500", "bg-theme-purple-500"
    ];
    
    // Get a value based on the name that will be consistent
    let sum = 0;
    for (let i = 0; i < name.length; i++) {
      sum += name.charCodeAt(i);
    }
    
    return colors[sum % colors.length];
  };
  
  // Get first letter or ?
  const firstLetter = name ? name.charAt(0).toUpperCase() : "?";
  
  // If we want to choose a different size for other place
  const sizeClasses = {
    sm: "w-8 h-8 text-sm",
    md: "w-10 h-10 text-base",
    lg: "w-12 h-12 text-xl"
  };

  // Use custom className if provided, otherwise use default size classes
  const sizeClass = className || sizeClasses[size];
  
  return (
    <div 
      className={`${getColorFromName(name)} ${sizeClass} rounded-full flex items-center justify-center text-white font-medium`}
      aria-label={`${name}'s avatar`}
    >
      {firstLetter}
    </div>
  );
};

export default UserAvatar;