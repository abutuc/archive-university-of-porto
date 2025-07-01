import type { File } from "@/types/file"

export const mockFiles: File[] = [
  {
    id: "1",
    name: "Project Proposal.pdf",
    type: "document",
    size: "2.4 MB",
    uploadedAt: "2023-05-15T10:30:00Z",
    owner: "You",
    url: null,
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [
        {
          id: "user1",
          name: "Jane Smith",
          email: "jane@example.com",
          access: "view",
        },
      ],
    },
  },
  {
    id: "2",
    name: "Company Logo.png",
    type: "image",
    size: "1.2 MB",
    uploadedAt: "2023-05-14T14:20:00Z",
    owner: "You",
    url: "/placeholder.svg?height=200&width=200",
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [],
    },
  },
  {
    id: "3",
    name: "Meeting Notes.docx",
    type: "document",
    size: "450 KB",
    uploadedAt: "2023-05-13T09:15:00Z",
    owner: "You",
    url: null,
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [
        {
          id: "user2",
          name: "John Doe",
          email: "john@example.com",
          access: "edit",
        },
        {
          id: "user3",
          name: "Sarah Johnson",
          email: "sarah@example.com",
          access: "view",
        },
      ],
    },
  },
  {
    id: "4",
    name: "Product Demo.mp4",
    type: "video",
    size: "24.5 MB",
    uploadedAt: "2023-05-12T16:45:00Z",
    owner: "You",
    url: null,
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [],
    },
  },
  {
    id: "5",
    name: "Financial Report.xlsx",
    type: "document",
    size: "3.1 MB",
    uploadedAt: "2023-05-11T11:30:00Z",
    owner: "You",
    url: null,
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [
        {
          id: "user4",
          name: "Michael Brown",
          email: "michael@example.com",
          access: "view",
        },
      ],
    },
  },
  {
    id: "6",
    name: "Team Photo.jpg",
    type: "image",
    size: "5.8 MB",
    uploadedAt: "2023-05-10T13:20:00Z",
    owner: "You",
    url: "/placeholder.svg?height=200&width=200",
    permissions: {
      owner: {
        id: "current-user",
        name: "You",
        access: "full",
      },
      shared: [],
    },
  },
]
