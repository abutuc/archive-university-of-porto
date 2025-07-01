

import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Dialog, DialogContent, DialogFooter, DialogHeader, DialogTitle } from "@/components/ui/dialog";
import { FolderPlusIcon } from "lucide-react";
import { NewDirectoryDialogProps } from "../types/props";

export function NewDirectoryDialog ({
		showNewDirectoryInput,
		setShowNewDirectoryInput,
		newDirectoryName,
		setNewDirectoryName,
		handleCreateDirectory,
}: NewDirectoryDialogProps) {

	return (
		<Dialog open={showNewDirectoryInput} onOpenChange={setShowNewDirectoryInput}>
			<DialogContent className="rounded-2xl shadow-xl bg-white">
				<DialogHeader>
					<DialogTitle className="flex items-center gap-2">
						<FolderPlusIcon className="mr-2 h-4 w-4" />
						New Directory
					</DialogTitle>
				</DialogHeader>
				<Input
					autoFocus
					placeholder="Directory name"
					value={newDirectoryName}
					onChange={e => setNewDirectoryName(e.target.value)}
					onKeyDown={e => {
						if (e.key === "Enter") handleCreateDirectory();
						if (e.key === "Escape") setShowNewDirectoryInput(false);
					}}
				/>
				<DialogFooter className="flex justify-between items-center">
					<div className="flex gap-2 bg-white">
						<Button variant="outline" size="sm" className="hover:bg-gray-100"
							onClick={handleCreateDirectory} disabled={!newDirectoryName.trim()}
						>
							Create
						</Button>
					</div>
					<Button
						variant="outline" size="sm" className="text-red-600 hover:bg-gray-100"
						onClick={() => setShowNewDirectoryInput(false)}
					>
						Cancel
					</Button>
				</DialogFooter>
			</DialogContent>
		</Dialog>
	)
}