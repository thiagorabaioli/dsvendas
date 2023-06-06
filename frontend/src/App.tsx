import DataTable from "components/DataTable";
import Footer from "components/Footer";
import Navbar from "components/Navbar";


function App() {
  return (
    <>
    <Navbar />
    <div className="container">
      <h1 className="text-primary"> Ola mundo!</h1>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
