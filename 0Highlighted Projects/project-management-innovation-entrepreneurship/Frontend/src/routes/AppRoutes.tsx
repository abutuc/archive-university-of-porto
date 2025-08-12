import { Routes, Route } from "react-router";
import SignIn from "../pages/SignIn/SignIn";
import AppLayout from "../layout/AppLayout";
import ExpenseReportSubmit from "../pages/ExpenseReportSubmit/ExpenseReportSubmit";
import ExpenseReportView from "../pages/ExpenseReportView/ExpenseReportView";
import StaffDashboard from "../pages/Dashboard/StaffDashboard";
import CollaboratorDashboard from "../pages/Dashboard/CollaboratorDashboard";
import ExpenseReportEdit from "../pages/ExpenseReportEdit/ExpenseReportEdit";
import AdminDashboard from "../pages/AdminDashboard";
import ProtectedRoute from "../auth/ProtectedRoute";
import { useAuth } from "../auth/AuthContext";
import CollaboratorProfile from "../pages/CollaboratorProfile/CollaboratorProfile";

export default function AppRoutes() {
  const { jobTitle } = useAuth();

  return (
    <Routes>
      <Route path="/signin" element={<SignIn />} />

      <Route element={<ProtectedRoute />}>
        <Route element={<AppLayout />}>
          <Route
            path="/"
            element={
              !jobTitle ? null : jobTitle === "Collaborator" ? (
                <CollaboratorDashboard />
              ) : jobTitle === "Super Admin" ? (
                <AdminDashboard />
              ) : (
                <StaffDashboard />
              )
            }
          />
          <Route path="/profile" element={<CollaboratorProfile />} />
          <Route path="/submit-report" element={<ExpenseReportSubmit />} />
          <Route path="/view-expense-report" element={<ExpenseReportView />} />
          <Route path="/edit-expense-report" element={<ExpenseReportEdit />} />
          <Route path="/admin-dashboard" element={<AdminDashboard />} />
        </Route>
      </Route>
    </Routes>
  );
}
