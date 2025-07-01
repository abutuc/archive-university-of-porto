"use client"

import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogFooter } from "@/components/ui/dialog"
import { Button } from "@/components/ui/button"
import { useState } from "react"
import { FolderX } from "lucide-react"
import { DeleteDirectoryDialogProps } from "../types/props"

export function DeleteDirectoryDialog({
	directory,
	onClose,
	onConfirm,
}: DeleteDirectoryDialogProps) {
	const [isOpen, setIsOpen] = useState(true)

	const handleClose = () => {
		setIsOpen(false)
		onClose()
	}

  return (
		<Dialog open={isOpen} onOpenChange={(open) => {
				setIsOpen(open)
				if (!open) onClose()
			}}>
			<DialogContent className="bg-white rounded-2xl shadow-xl">
				<DialogHeader>
					<DialogTitle className="flex items-center gap-2">
						<FolderX className="mr-2 h-4 w-4" />
						Delete Directory
					</DialogTitle>
				</DialogHeader>
				<div className="py-4 px-2 text-center">
					<p className="text-lg font-semibold mb-2">
						Are you sure you want to delete the directory
						<span className="font-extrabold"> {directory.name}</span>?
					</p>
					<p className="text-sm text-gray-600">
						All of the files inside of this directory will also be deleted.
						<br />
						<span className="text-red-600 font-bold">This action is IRREVERSIBLE.</span>
					</p>
				</div>
				<DialogFooter className="flex justify-between items-center">
					<Button
						variant="outline" size="sm" className="hover:bg-gray-100"
						onClick={handleClose}
					>
						Cancel
					</Button>
					<div className="flex gap-2 bg-white">
						<Button 
							variant="outline" size="sm" className="font-bold  text-red-600 hover:bg-gray-100"
							onClick={onConfirm}
						>
							Confirm
						</Button>
					</div>
				</DialogFooter>
			</DialogContent>
		</Dialog>
  )
}
