import { useEffect, useState } from "react";
import { useTranslation } from "react-i18next";
import PageMeta from "../../components/PageMeta";
import Label from "../../components/Label";
import Select from "../../components/Select";
import Button from "../../components/Button";
import LoadingOverlay from "../../components/LoadingOverlay";

import { API_BASE_URL } from "../../config";
import { useAuth } from "../../auth/AuthContext";
import { useCatalogs } from "../../hooks/useCatalogs";
import { mapToOptions } from "../../utils/CatalogMapper";
import { useNavigate } from "react-router";

export default function CollaboratorProfile() {
  const { t, i18n } = useTranslation();
  const { catalogs } = useCatalogs();
  const lang = i18n.language;
  const { backendAccessToken } = useAuth();
  const navigate = useNavigate();

  const [hasFetchedUser, setHasFetchedUser] = useState(false);

  const [user, setUser] = useState({
    company: "",
    direction: "",
    unit: "",
    office: "",
    type_of_employee: "",
  });

  const [isEditing, setIsEditing] = useState(false);
  const [loading, setLoading] = useState(false);

  const handleChange = (attribute: string, value: string) => {
    setUser((prevUser) => ({
      ...prevUser,
      [attribute]: value,
    }));
  };

  const isFormComplete = Object.values(user).every((value) => !!value);

  const missingFields = Object.entries(user)
    .filter(([_, value]) => !value)
    .map(([key]) => t(key));

  const handleSave = async () => {
    if (!isFormComplete) return;

    setLoading(true);
    try {
      const response = await fetch(`${API_BASE_URL}/user/me`, {
        method: "PUT",
        headers: {
          "Content-Type": "application/json",
          Authorization: `Bearer ${backendAccessToken}`,
        },
        body: JSON.stringify(user),
      });

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      setIsEditing(false);
    } catch (error) {
      console.error("Failed to update user info:", error);
    } finally {
      setLoading(false);
      navigate("/");
    }
  };

  const fetchAndSetUserDefaults = async () => {
    setLoading(true);
    try {
      const response = await fetch(`${API_BASE_URL}/user/me`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${backendAccessToken}`,
        },
      });

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const fetchedUser = await response.json();
      setUser(fetchedUser);

      // Enable editing if any field is empty or null
      const hasMissingFields = Object.values(fetchedUser).some(
        (value) => value === null || value === ""
      );
      if (hasMissingFields) {
        setIsEditing(true);
      }
      setHasFetchedUser(true);
    } catch (error) {
      console.error("Failed to fetch user info:", error);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchAndSetUserDefaults();
  }, [backendAccessToken]);

  const companies = mapToOptions(catalogs.companies, lang);
  const directions = mapToOptions(catalogs.directions, lang);
  const units = mapToOptions(catalogs.units, lang);
  const offices = mapToOptions(catalogs.offices, lang);
  const employeeTypes = mapToOptions(catalogs.employee_types, lang);

  return (
    <div>
      <PageMeta
        title="Collaborator Profile"
        description="This is the page for the collaborator to manage its company information."
      />

      {/* Warning message if there are missing fields */}
      {hasFetchedUser && !isFormComplete && (
        <div className="bg-yellow-100 border border-yellow-400 text-yellow-800 p-4 rounded-md mb-4">
          <strong>{t("warning")}:</strong> {t("missing_profile_warning")}{" "}
          <ul className="list-disc list-inside ml-4 mt-2">
            {missingFields.map((field, index) => (
              <li key={index}>{field}</li>
            ))}
          </ul>
        </div>
      )}

      <div className="pb-2 space-y-4">
        <div className="grid grid-cols-1 gap-6">
          <div>
            <Label required htmlFor="company">
              {t("company")}
            </Label>
            <Select
              id="company"
              currentValue={user.company}
              options={companies}
              placeholder={t("select_company")}
              onChange={(company) => handleChange("company", company)}
              disabled={!isEditing}
            />
          </div>
          <div>
            <Label required htmlFor="direction">
              {t("direction")}
            </Label>
            <Select
              id="direction"
              currentValue={user.direction}
              options={directions}
              placeholder={t("select_direction")}
              onChange={(direction) => handleChange("direction", direction)}
              disabled={!isEditing}
            />
          </div>
          <div>
            <Label required htmlFor="unit">
              {t("unit")}
            </Label>
            <Select
              id="unit"
              currentValue={user.unit}
              options={units}
              placeholder={t("select_unit")}
              onChange={(unit) => handleChange("unit", unit)}
              disabled={!isEditing}
            />
          </div>
          <div>
            <Label required htmlFor="office">
              {t("office")}
            </Label>
            <Select
              id="office"
              currentValue={user.office}
              options={offices}
              placeholder={t("select_office")}
              onChange={(office) => handleChange("office", office)}
              disabled={!isEditing}
            />
          </div>
          <div>
            <Label required htmlFor="type_of_employee">
              {t("collaborator_type")}
            </Label>
            <Select
              id="type_of_employee"
              currentValue={user.type_of_employee}
              options={employeeTypes}
              placeholder={t("select_collaborator_type")}
              onChange={(type) => handleChange("type_of_employee", type)}
              disabled={!isEditing}
            />
          </div>
        </div>
      </div>

      <div className="mt-4">
        {isEditing ? (
          <Button
            className="mr-4"
            size="sm"
            variant="outline"
            onClick={handleSave}
            disabled={!isFormComplete}
          >
            {t("save")}
          </Button>
        ) : (
          <Button
            size="sm"
            variant="outline"
            onClick={() => setIsEditing(true)}
          >
            {t("edit")}
          </Button>
        )}
      </div>

      {loading && <LoadingOverlay />}
    </div>
  );
}
