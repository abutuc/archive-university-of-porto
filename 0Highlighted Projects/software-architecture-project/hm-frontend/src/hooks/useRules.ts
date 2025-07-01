import { useEffect, useState } from "react";
import {RuleRequest} from "../types.ts";


export default function useRules() {
    const [rules, setRules] = useState<RuleRequest[]>([]);

    const getRules = async () => {
        const response = await fetch("/api/rules");
        const data = await response.json();
        console.log(data);
        if (!response.ok) return;
        setRules(data);
    };

    const addRule = async (rule: string) => {
        console.log(rule);
        await fetch(`/api/rules?rule=${rule}`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
        });
        getRules();
    };

    const removeRule = async (id: string) => {
        await fetch(`/api/rules/${id}`, {
            method: "DELETE",
        });
        getRules();
    };

    useEffect(() => {
        getRules();
    }, []);

    return {rules, addRule, removeRule};
}