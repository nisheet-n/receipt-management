import React from "react";
import { Route, Routes } from "react-router-dom";
import InvoiceDashboard from "./views/InvoiceDashboard";

const App = () => {
  return (
    <Routes>
      <Route path="/" element={<InvoiceDashboard />} />
    </Routes>
  );
};

export default App;
