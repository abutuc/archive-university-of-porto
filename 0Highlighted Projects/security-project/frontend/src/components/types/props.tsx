import { Directory, SESFile } from "./types";

interface FileUploaderProps {
  onUpload: (files: SESFile[]) => void;
  currentDirectory: string;
}

interface FileCardProps {
  file: SESFile;
  viewMode: "grid" | "list";
  onSelect: () => void;
  onDelete: () => void;
}

interface FileDetailsDialogProps {
  file: SESFile;
  onClose: () => void;
  onDelete: () => void;
  onUpdatePermissions: (permissions: string) => void;
  onFileUpdated?: (file: File) => void;
}

interface FileEditModalProps {
  open: boolean;
  file: SESFile;
  onClose: () => void;
  onSuccess?: () => void;
  onFileUpdated?: (file: SESFile) => void;
}

interface BreadcrumbsProps {
  path : { id: string; name: string }[],
  setCurrentDirectory : (id: string) => void,
}

interface DirectoryCardProps {
  directory: Directory;
  viewMode: "grid" | "list";
  onSelect: () => void;
  onDelete: () => void;
  onShare: () => void;
}

interface DirPermsTabProps {
  directoryId: string;
  onPermissionsChanged?: () => void;
}

interface DirectoryShareModalProps {
  open: boolean;
  onClose: () => void;
  directoryId: string;
}

interface DeleteDirectoryDialogProps {
	directory: Directory;
	onClose: () => void;
	onConfirm: () => void;
}

interface NewDirectoryDialogProps {
	showNewDirectoryInput: boolean;
	setShowNewDirectoryInput: (show: boolean) => void;
	newDirectoryName: string;
	setNewDirectoryName: (name: string) => void;
	handleCreateDirectory: () => void;
}

interface PermissionsTabProps {
  file: SESFile;
  onUpdatePermissions?: (permission : string) => void;
}

interface DashboardHeaderProps {
  heading: string
  text?: string
  children?: React.ReactNode
}

interface FeatureCardProps {
  icon: React.ReactNode
  color: string
  description: string
  title: string
}

export type { 
  FileUploaderProps, FileCardProps, FileDetailsDialogProps, FileEditModalProps,
  BreadcrumbsProps, 
  DirectoryCardProps, DirPermsTabProps, DeleteDirectoryDialogProps, NewDirectoryDialogProps, DirectoryShareModalProps,
  PermissionsTabProps,
  DashboardHeaderProps,
  FeatureCardProps
};