import React, { useState, useEffect } from 'react';
import logo from '/src/assets/hm-logo.png'; // Import logo image

// Utility function to validate email format
const validateEmail = (email: string) => /\S+@\S+\.\S+/.test(email);

// Login component
export default function Login() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState<string | null>(null);
    const [isSubmitting, setIsSubmitting] = useState(false); // To handle loading state during form submission

    // Focus the email input on component mount
    useEffect(() => {
        document.getElementById('email')?.focus();
    }, []);

    // Handle form submission with enhanced validation and error handling
    const handleSubmit = (e: React.FormEvent) => {
        e.preventDefault();
        setError(null); // Reset error before submission

        // Basic form validation
        if (!validateEmail(email)) {
            setError('Please enter a valid email address.');
            return;
        }
        if (password.length < 6) {
            setError('Password must be at least 6 characters.');
            return;
        }

        setIsSubmitting(true); // Indicate that the form is being submitted

        // Simulate a successful login request (replace with actual API call)
        setTimeout(() => {
            setIsSubmitting(false);
            // Assuming login success, redirect or handle login logic here
            console.log('Form submitted', { email, password });
        }, 2000);
    };

    return (
        <div className="flex min-h-full flex-1 flex-col justify-center px-6 py-12 lg:px-8">
            {/* Logo and title */}
            <div className="sm:mx-auto sm:w-full sm:max-w-sm">
                <img
                    alt="NAZUS Logo"
                    src={logo}
                    className="mx-auto h-96 w-auto"
                />
                <h2 className="mt-10 text-center text-2xl font-bold tracking-tight">
                    Sign in to your account
                </h2>
            </div>

            {/* Form container */}
            <div className="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">
                <form onSubmit={handleSubmit} className="space-y-6">
                    {/* Display error message if there is one */}
                    {error && <div role="alert" aria-live="assertive" className="text-red-500">{error}</div>}

                    {/* Email input */}
                    <div>
                        <label htmlFor="email" className="block text-sm font-medium">Email address</label>
                        <div className="mt-2">
                            <input
                                id="email"
                                name="email"
                                type="email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                                required
                                autoComplete="email"
                                aria-describedby="email-error" // Links the error message to this input field
                                className="block w-full rounded-md border-0 px-3 py-1.5 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm"
                            />
                        </div>
                    </div>

                    {/* Password input */}
                    <div>
                        <div className="flex items-center justify-between">
                            <label htmlFor="password" className="block text-sm font-medium">Password</label>
                            <div className="text-sm">
                                <a href="#" className="font-semibold text-indigo-600 hover:text-indigo-500">
                                    Forgot password?
                                </a>
                            </div>
                        </div>
                        <div className="mt-2">
                            <input
                                id="password"
                                name="password"
                                type="password"
                                value={password}
                                onChange={(e) => setPassword(e.target.value)}
                                required
                                autoComplete="new-password" // Enhance security by specifying a new password field
                                aria-describedby="password-error" // Links the error message to this input field
                                className="block w-full rounded-md border-0 px-3 py-1.5 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm"
                            />
                        </div>
                    </div>

                    {/* Submit button */}
                    <div>
                        <button
                            type="submit"
                            disabled={isSubmitting} // Disable the button while submitting
                            className="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                        >
                            {isSubmitting ? 'Signing in...' : 'Sign in'} {/* Dynamic button text based on submission state */}
                        </button>
                    </div>
                </form>

                {/* Registration link */}
                <p className="mt-10 text-center text-sm text-gray-500">
                    Not a member?{' '}
                    <a href="#" className="font-semibold text-indigo-600 hover:text-indigo-500">
                        Register now!
                    </a>
                </p>
            </div>
        </div>
    );
}
