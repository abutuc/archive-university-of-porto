## Development Guidelines

### Folder Structure

```plaintext
Frontend/
├── public/
├── src/
│   ├── assets/
│   ├── components/
│       ├── layout/
│   ├── features/
│       ├── auth/
│   ├── hooks/
│   ├── layouts/
│       ├── MainLayout.tsx
│   ├── pages/
│   │   ├── ExpenseReportSubmit/
│   │   │   ├── ExpenseReportSubmit.tsx
│   │   │   ├── ExpenseReportSubmit.test.tsx
│   │   │   ├── components/
│   ├── routes/
│   ├── services/
│   ├── store/
│   ├── types/
│   ├── utils/
│   ├── App.tsx
│   ├── main.tsx


```

- `public/` - Used for favicon, robots.txt, sitemap, static files accessed via URL and third-party libraries scripts.
- `src/` - Contains all the source files.
  - `assets/` - Contains images, fonts, icons, stylesheets, etc.
  - `components/` - Contains reusable components that are used in multiple pages.
    - `layout/` - Contains layout components such as Header, Footer, Sidebar, etc.
  - `features/` - Contains reusable unit of functionality which is domain-specific and reused across multiple pages.
    - `auth/` - Contains authentication related features.
  - `hooks/` - Contains custom hooks that wrap around services to provide a React-friendly abstraction.
  - `layouts/` - Contains page skeletons that are used to wrap around pages. For example, MainLayout.tsx is used to wrap around all the pages in the app.
  - `pages/` - Contains all the pages of the app. Each page is a React component that is rendered by the router.
    - `ExpenseReportSubmit/` - Contains the ExpenseReportSubmit page and its components.
      - `ExpenseReportSubmit.tsx` - The main component of the ExpenseReportSubmit page.
      - `ExpenseReportSubmit.test.tsx` - The test file for the ExpenseReportSubmit page.
      - `components/` - Contains components that are used only in the ExpenseReportSubmit page.
  - `routes/` - Contains the routes of the app. Each route is a React component that is rendered by the router.
  - `services/` - Contains services that are used to interact with the backend API. Each service is a JavaScript module that exports functions to interact with the API.
  - `store/` - Contains the Redux store and slices.
  - `types/` - Contains TypeScript types and interfaces that are used throughout the app.
  - `utils/` - Contains utility functions that are used throughout the app.
  - `App.tsx` - The main app component that is rendered by the router.
  - `main.tsx` - The entry point of the app that renders the App component.
