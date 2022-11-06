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
    public class DestinoController : ControllerBase
    {

        private readonly DestinoDbContext _context;
        public DestinoController(DestinoDbContext context)
        {
            _context = context;
        }

        //Get : api/Destinos - Lista todos os Destinos
        [HttpGet]
        public IEnumerable<Destino> GetDestinos()
        {
            return _context.Destinos;
        }

        //get : api/Destinos/id - Lista destinos por id
        [HttpGet("{id}")]
        public IActionResult GetDestinoPorId(int id)
        {
            Destino destino = _context.Destinos.SingleOrDefault(modelo => modelo.DestinoId == id);
            if (destino == null)
            {
                return NotFound();
            }
            return new ObjectResult(destino);

        }


        // Criar novo Destino
        [HttpPost]
        public IActionResult CriarDestino(Destino item)
        {
            if(item == null)
            {
                return BadRequest();
            }

            _context.Destinos.Add(item);
            _context.SaveChanges(); 
            return new ObjectResult(item);
        }

        // Atualiza um Destino

        [HttpPut("{id}")]
        public IActionResult AtualizaDestino(int id, Destino item)
        {
            if ( id != item.DestinoId)
            {
                return BadRequest();

            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();

            return new NoContentResult();
        }

        // Apaga um Destino por ID

        [HttpDelete("{id}")]
        public IActionResult DeletaDestino(int id)
        {
            var destino = _context.Destinos.SingleOrDefault(m => m.DestinoId == id);
            if(destino == null)
            {
                return BadRequest();
            }
            _context.Destinos.Remove(destino);
            _context.SaveChanges();
            return Ok(destino);
        }
    }

}

