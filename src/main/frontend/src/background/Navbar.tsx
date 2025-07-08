import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
  return (
    <nav className="bg-zinc-800 p-4">
      <div className="container mx-auto">
        <div className="flex items-center justify-between">
          <ul className="flex space-x-4">
            <li>
              <Link className="text-white hover:text-gray-400" to="/*">SBIN</Link>
            </li>
            <li>
              <Link className="text-white hover:text-gray-400" to="/tabone">TCS</Link>
            </li>
            <li>
              <Link className="text-white hover:text-gray-400" to="/tabtwo">INFY</Link>
            </li>
            <li>
              <Link className="text-white hover:text-gray-400" to="/tabthree">HDFCBANK</Link>
            </li>
            <li>
              <Link className="text-white hover:text-gray-400" to="/tabfour">RELIANCE</Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
