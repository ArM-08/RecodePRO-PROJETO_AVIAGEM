using Api_Agencia.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Collections.Generic;
using System.Linq;



namespace Api_Agencia.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClienteController : ControllerBase
    {

        private readonly ClienteDbContext _context;
        public ClienteController(ClienteDbContext context)
        {
            _context = context;
        }

        //Get : api/Clientes - Lista todos os Clientes
        [HttpGet]
        public IEnumerable<Cliente> GetDestinos()
        {
            return _context.Clientes;
        }

        //get : api/Clientes/id - Lista Clientes por id
        [HttpGet("{id}")]
        public IActionResult GetClientePorId(int id)
        {
            Cliente clientes = _context.Clientes.SingleOrDefault(modelo => modelo.ClienteID == id);
            if (clientes == null)
            {
                return NotFound();
            }
            return new ObjectResult(clientes);

        }


        // Criar novo Clientes
        [HttpPost]
        public IActionResult CriarCliente(Cliente item)
        {
            if(item == null)
            {
                return BadRequest();
            }

            _context.Clientes.Add(item);
            _context.SaveChanges(); 
            return new ObjectResult(item);
        }

        // Atualiza um Clientes

        [HttpPut("{id}")]
        public IActionResult AtualizaCliente(int id, Cliente item)
        {
            if ( id != item.ClienteID)
            {
                return BadRequest();

            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();

            return new NoContentResult();
        }

        // Apaga um Cliente por ID

        [HttpDelete("{id}")]
        public IActionResult DeletaCliente(int id)
        {
            var Cliente = _context.Clientes.SingleOrDefault(m => m.ClienteID == id);
            if(Cliente == null)
            {
                return BadRequest();
            }
            _context.Clientes.Remove(Cliente);
            _context.SaveChanges();
            return Ok(Cliente);
        }
    }

}

