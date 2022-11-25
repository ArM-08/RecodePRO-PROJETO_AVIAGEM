import Pesquisa from "../Pesquisa";




const AdminBoard = () => {
    return(
        <div className="w-100">
            <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 w-100 col-12  border-bottom ">
        <h1 className="h2 mx-5">Painel Admin</h1>
        <div className="btn-toolbar mb-2 mb-md-0 mx-4">
          <div className="btn-group me-2">
            <button type="button" className="btn btn-sm btn-outline-secondary">Share</button>
            <button type="button" className="btn btn-sm btn-outline-secondary">Export</button>
          </div>
          
        </div>
      </div>
      <div className="boardAdmin">
        <h1 className="tituloDest">Destinos</h1>
        </div>
        <Pesquisa/>
        </div>

    )
}
export default AdminBoard;