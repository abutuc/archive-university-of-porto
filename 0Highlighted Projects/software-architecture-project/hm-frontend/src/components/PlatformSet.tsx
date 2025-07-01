import { FaDiscord, FaSlack } from "react-icons/fa";
import { IoIosNotifications } from "react-icons/io";
import { useEffect, useState } from "react";


const PlatformSet = ({isOpen, setIsOpen}) => {
  const [platform, setPlatform] = useState<any>();

  useEffect(() => {
    getPlatforms();
  }, []);
  const getPlatforms = async () => {
    const response = await fetch("/api/notifiers");
    const data = await response.json();
    setPlatform(data);
    console.log(data);
  };

  if (!platform || !isOpen) return (
    <div className="justify-self-end">
      <button
        className="bg-primary flex items-center text-white font-medium px-base py-1 my-2 rounded-soft shadow hover:bg-secondary hover:scale-105 active:scale-95 transition-transform duration-200 justify-self-end"
        onClick={() => setIsOpen(true)}>
        <IoIosNotifications className="size-5" /> Set Notifiers
      </button>
    </div>
  );



  const updatePlatforms = async () => {
    console.log(platform.discordNotifier);
    console.log(platform.slackNotifier);
    await fetch(
      `/api/notifiers?discordNotifier=${platform.discordNotifier}&slackNotifier=${platform.slackNotifier}`,
      { method: "POST" }
    );

    getPlatforms();
    setIsOpen(false);
  };

  const handleCheckboxChange = (notifier: "discordNotifier" | "slackNotifier") => {
    setPlatform((prevPlatform: any) => ({
      ...prevPlatform,
      [notifier]: !prevPlatform[notifier],
    }));
  };



  return (
      <div className="fixed inset-0 bg-black bg-opacity-50 flex justify-center items-center z-50">
        <div className="bg-background p-6 m-4 rounded-lg shadow-lg w-full max-w-sm">
          <div className="flex justify-end">
            <button
                className="text-red-500 hover:text-red-700 text-xl"
                onClick={() => setIsOpen(false)}
                aria-label="Close Notifiers Settings"
            >
              &times;
            </button>
          </div>
          <div className="flex flex-col items-center">
            <h1 className="text-xl font-medium mb-4 text-text">How do you want to get notified?</h1>
            <div className="flex gap-6 mb-4">
              <div className="flex flex-col items-center">
                <FaDiscord className="text-3xl text-blue-600 mb-2" aria-hidden="true" />
                <label className="inline-flex items-center">
                  <input
                      type="checkbox"
                      id="discord"
                      checked={platform.discordNotifier}
                      onChange={() => handleCheckboxChange("discordNotifier")}
                      className="form-checkbox h-5 w-5 text-blue-600"
                  />
                  <span className="ml-2 text-text">Discord</span>
                </label>
              </div>
              <div className="flex flex-col items-center">
                <FaSlack className="text-3xl text-green-500 mb-2" aria-hidden="true" />
                <label className="inline-flex items-center">
                  <input
                      type="checkbox"
                      id="slack"
                      checked={platform.slackNotifier}
                      onChange={() => handleCheckboxChange("slackNotifier")}
                      className="form-checkbox h-5 w-5 text-green-500"
                  />
                  <span className="ml-2 text-text">Slack</span>
                </label>
              </div>
            </div>
            <button
                onClick={updatePlatforms}
                className="w-full bg-primary text-white font-medium px-4 py-2 rounded hover:bg-secondary focus:outline-none focus:ring-2 focus:ring-primary transition"
                aria-label="Update Notifiers"
            >
              Update
            </button>
          </div>
        </div>
      </div>
  );
};

export default PlatformSet;