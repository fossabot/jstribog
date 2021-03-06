/*
    Copyright (C) 2014  sarin

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ru.ubmb.jstribog;

/**
 *
 * @author sarin
 */
public class TestVectors {

    public static int[][][] L = {
        {
            {
                0x68, 0x4B, 0xD3, 0x6B, 0x3B, 0xB4, 0x4E, 0x84, 0xB1, 0x0F, 0x91, 0xD2, 0x09, 0x9A, 0x8F, 0x90, 0xFE, 0xBE, 0xE9, 0x55, 0x13, 0xA7, 0xD3, 0xA9, 0x03, 0xE1, 0x81, 0x73, 0xE2, 0xC2, 0xF4, 0xA6, 0xD8, 0xF1, 0x95, 0x0B, 0x0D, 0x7D, 0x04, 0x72, 0x04, 0x49, 0xBF, 0x4C, 0x6B, 0x3D, 0xB3, 0xD4, 0x2C, 0x35, 0xD6, 0xBC, 0x50, 0xA2, 0x3D, 0x28, 0x9A, 0xA6, 0x20, 0xB2, 0x41, 0xDF, 0xD5, 0x1B
            }, {
                0x33, 0xB7, 0xEC, 0x4A, 0x28, 0xF5, 0x20, 0x0F, 0xD3, 0x87, 0x85, 0xB8, 0x6E, 0x04, 0x5D, 0xAF, 0x4C, 0x1D, 0xEC, 0x94, 0xD1, 0xA9, 0xCE, 0x79, 0xCB, 0xEE, 0x5D, 0xB5, 0xED, 0xD2, 0xAF, 0xBD, 0xBE, 0x0C, 0x38, 0x58, 0xE2, 0x47, 0x6F, 0xEC, 0x78, 0xF1, 0x92, 0x2D, 0xC3, 0xD0, 0x64, 0x15, 0xC5, 0x06, 0xC8, 0x4F, 0x71, 0xAF, 0xDF, 0xDA, 0xF4, 0x18, 0x03, 0x7F, 0x1C, 0x19, 0x2A, 0x60
            }
        }, {
            {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }, {
                0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74
            }
        }
    };

    public static int[][][] P = {
        {
            {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }, {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }
        }, {
            {
                0x68, 0xB1, 0xFE, 0x03, 0xD8, 0x04, 0x2C, 0x9A, 0x4B, 0x0F, 0xBE, 0xE1, 0xF1, 0x49, 0x35, 0xA6, 0xD3, 0x91, 0xE9, 0x81, 0x95, 0xBF, 0xD6, 0x20, 0x6B, 0xD2, 0x55, 0x73, 0x0B, 0x4C, 0xBC, 0xB2, 0x3B, 0x09, 0x13, 0xE2, 0x0D, 0x6B, 0x50, 0x41, 0xB4, 0x9A, 0xA7, 0xC2, 0x7D, 0x3D, 0xA2, 0xDF, 0x4E, 0x8F, 0xD3, 0xF4, 0x04, 0xB3, 0x3D, 0xD5, 0x84, 0x90, 0xA9, 0xA6, 0x72, 0xD4, 0x28, 0x1B
            }, {
                0x68, 0x4B, 0xD3, 0x6B, 0x3B, 0xB4, 0x4E, 0x84, 0xB1, 0x0F, 0x91, 0xD2, 0x09, 0x9A, 0x8F, 0x90, 0xFE, 0xBE, 0xE9, 0x55, 0x13, 0xA7, 0xD3, 0xA9, 0x03, 0xE1, 0x81, 0x73, 0xE2, 0xC2, 0xF4, 0xA6, 0xD8, 0xF1, 0x95, 0x0B, 0x0D, 0x7D, 0x04, 0x72, 0x04, 0x49, 0xBF, 0x4C, 0x6B, 0x3D, 0xB3, 0xD4, 0x2C, 0x35, 0xD6, 0xBC, 0x50, 0xA2, 0x3D, 0x28, 0x9A, 0xA6, 0x20, 0xB2, 0x41, 0xDF, 0xD5, 0x1B
            }
        }
    };

    public static int[][][] S = {
        {
            {
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
            }, {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }
        }, {
            {
                0x34, 0xA6, 0xC7, 0x7D, 0x36, 0x31, 0xA7, 0x3F, 0x72, 0x27, 0x94, 0xAA, 0xBB, 0x05, 0x41, 0x38, 0x79, 0x2F, 0xE6, 0x46, 0x2D, 0xEB, 0xAD, 0x99, 0xD8, 0x26, 0x2D, 0xBD, 0x23, 0x49, 0x29, 0x90, 0xF0, 0x18, 0x48, 0x6C, 0x40, 0x4A, 0x55, 0x5E, 0xFF, 0xD2, 0x76, 0x40, 0x95, 0x60, 0x6B, 0x25, 0x08, 0x51, 0xC8, 0x38, 0xA3, 0xD3, 0x85, 0x20, 0x79, 0xE5, 0x21, 0x18, 0x74, 0xEE, 0x93, 0xFF
            }, {
                0xE3, 0x62, 0xF7, 0xBD, 0x8F, 0x84, 0x44, 0x1F, 0x19, 0x21, 0x7A, 0x38, 0x7D, 0x6E, 0x34, 0x06, 0x54, 0x4F, 0x09, 0x48, 0x01, 0xD0, 0x9F, 0xE8, 0x8D, 0xEF, 0x01, 0xD5, 0x5A, 0x2A, 0x1C, 0xE0, 0x59, 0x17, 0xF2, 0x9D, 0xEB, 0x68, 0x0C, 0x5D, 0xB6, 0x83, 0x8A, 0xEB, 0x94, 0x15, 0x6F, 0x5C, 0xFB, 0x70, 0x30, 0x06, 0x73, 0x49, 0xA8, 0xF9, 0x54, 0x2B, 0x18, 0x17, 0xFF, 0x6C, 0xDE, 0xB6
            }
        }
    };

    public static int[][][] LPS = {
        {
            {
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
            }, {
                0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74, 0xB3, 0x83, 0xFC, 0x2E, 0xCE, 0xD4, 0xA5, 0x74
            }
        }, {
            {
                0x1B, 0x2F, 0x40, 0x57, 0x73, 0x5A, 0x59, 0x8F, 0x4B, 0x2E, 0xC8, 0x89, 0x92, 0xEA, 0x7D, 0x89, 0xE5, 0x8F, 0x52, 0x12, 0x3A, 0x3D, 0x18, 0xF0, 0x4D, 0xAC, 0xA1, 0x85, 0x36, 0x1B, 0x88, 0xD0, 0x85, 0x60, 0x37, 0x3D, 0x90, 0x81, 0x16, 0x53, 0x60, 0x76, 0x5B, 0xB6, 0x8B, 0x19, 0x03, 0x0E, 0xAC, 0x61, 0x27, 0x9B, 0x31, 0xA0, 0x92, 0x7B, 0xF3, 0x03, 0x9A, 0xB9, 0x94, 0xCE, 0x12, 0xA9
            }, {
                0x34, 0x39, 0x2E, 0xD3, 0x2E, 0xA3, 0x75, 0x6E, 0x32, 0x97, 0x9C, 0xB0, 0xA2, 0x24, 0x7C, 0x39, 0x18, 0xE0, 0xB3, 0x8D, 0x64, 0x55, 0xCA, 0x88, 0x18, 0x33, 0x56, 0xBF, 0x8E, 0x58, 0x77, 0xE5, 0x5D, 0x54, 0x22, 0x78, 0xA6, 0x96, 0x52, 0x3A, 0x80, 0x36, 0xAF, 0x0F, 0x1C, 0x29, 0x02, 0xE9, 0xCB, 0xC5, 0x85, 0xDE, 0x80, 0x3E, 0xE4, 0xD2, 0x66, 0x49, 0xC9, 0xE1, 0xF0, 0x0B, 0xDA, 0x31
            }
        }
    };

    public static int[][][] AddMod = {
        {
            {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }, {
                0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC, 0xFC
            }, {
                0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF9, 0xF8
            }
        }, {
            {
                0x68, 0xB1, 0xFE, 0x03, 0xD8, 0x04, 0x2C, 0x9A, 0x4B, 0x0F, 0xBE, 0xE1, 0xF1, 0x49, 0x35, 0xA6, 0xD3, 0x91, 0xE9, 0x81, 0x95, 0xBF, 0xD6, 0x20, 0x6B, 0xD2, 0x55, 0x73, 0x0B, 0x4C, 0xBC, 0xB2, 0x3B, 0x09, 0x13, 0xE2, 0x0D, 0x6B, 0x50, 0x41, 0xB4, 0x9A, 0xA7, 0xC2, 0x7D, 0x3D, 0xA2, 0xDF, 0x4E, 0x8F, 0xD3, 0xF4, 0x04, 0xB3, 0x3D, 0xD5, 0x84, 0x90, 0xA9, 0xA6, 0x72, 0xD4, 0x28, 0x1B
            }, {
                0x68, 0x4B, 0xD3, 0x6B, 0x3B, 0xB4, 0x4E, 0x84, 0xB1, 0x0F, 0x91, 0xD2, 0x09, 0x9A, 0x8F, 0x90, 0xFE, 0xBE, 0xE9, 0x55, 0x13, 0xA7, 0xD3, 0xA9, 0x03, 0xE1, 0x81, 0x73, 0xE2, 0xC2, 0xF4, 0xA6, 0xD8, 0xF1, 0x95, 0x0B, 0x0D, 0x7D, 0x04, 0x72, 0x04, 0x49, 0xBF, 0x4C, 0x6B, 0x3D, 0xB3, 0xD4, 0x2C, 0x35, 0xD6, 0xBC, 0x50, 0xA2, 0x3D, 0x28, 0x9A, 0xA6, 0x20, 0xB2, 0x41, 0xDF, 0xD5, 0x1B
            }, {
                0xD0, 0xFD, 0xD1, 0x6F, 0x13, 0xB8, 0x7B, 0x1E, 0xFC, 0x1F, 0x50, 0xB3, 0xFA, 0xE3, 0xC5, 0x37, 0xD2, 0x50, 0xD2, 0xD6, 0xA9, 0x67, 0xA9, 0xC9, 0x6F, 0xB3, 0xD6, 0xE6, 0xEE, 0x0F, 0xB1, 0x59, 0x13, 0xFA, 0xA8, 0xED, 0x1A, 0xE8, 0x54, 0xB3, 0xB8, 0xE4, 0x67, 0x0E, 0xE8, 0x7B, 0x56, 0xB3, 0x7A, 0xC5, 0xAA, 0xB0, 0x55, 0x55, 0x7A, 0xFE, 0x1F, 0x36, 0xCA, 0x58, 0xB4, 0xB3, 0xFD, 0x36
            }
        }
    };

    public static int[][] KS = {
        {
            0x72, 0xF2, 0x70, 0x59, 0x18, 0x3D, 0xB0, 0x01, 0x13, 0x9C, 0x12, 0x70, 0xF3, 0x6A, 0x77, 0xE9, 0x0D, 0x49, 0x2D, 0xCE, 0xC5, 0xDE, 0x13, 0x8B, 0x38, 0x99, 0x0E, 0x1F, 0xB7, 0x6A, 0xCD, 0x2D, 0xF4, 0xC4, 0x1D, 0xAB, 0x01, 0x57, 0x67, 0xC6, 0x0D, 0x94, 0xA0, 0x3C, 0xAC, 0x8A, 0xDA, 0xAD, 0x9B, 0xA3, 0x21, 0x14, 0x96, 0x27, 0xAA, 0xB2, 0x61, 0xEE, 0x30, 0x86, 0xCF, 0x81, 0xD2, 0xE5
        }, {
            0x0D, 0x6E, 0x08, 0x6A, 0x75, 0x6F, 0x2C, 0x5A, 0x9A, 0xC8, 0x64, 0x17, 0xEF, 0xF4, 0xFC, 0x8B, 0xA6, 0xDE, 0xD9, 0x91, 0x73, 0x1F, 0x71, 0x90, 0x97, 0xB2, 0x66, 0x99, 0xBB, 0x88, 0x0F, 0xB2, 0xC5, 0x18, 0xB3, 0xBF, 0xD4, 0xB1, 0x22, 0x25, 0xCC, 0x50, 0x7E, 0x75, 0x2C, 0x7C, 0xFF, 0xB4, 0x58, 0x50, 0x98, 0xFA, 0x8F, 0xA3, 0xEB, 0xE9, 0x4D, 0x0A, 0xFD, 0xF4, 0xED, 0x9E, 0xC7, 0x13
        }, {
            0xCD, 0x65, 0xBF, 0xCA, 0x73, 0x68, 0x09, 0x8E, 0x8C, 0xD2, 0x24, 0xBC, 0x77, 0x10, 0xE8, 0x42, 0x43, 0x7F, 0x0D, 0x48, 0x1A, 0x7C, 0x1A, 0xDB, 0x86, 0xF6, 0x4C, 0xA3, 0xC7, 0xA3, 0x2C, 0xF8, 0x5E, 0x5B, 0x04, 0x45, 0xA6, 0xC4, 0x42, 0xBC, 0x97, 0x2A, 0x01, 0x3C, 0x6C, 0x48, 0x2B, 0x47, 0x0A, 0x6C, 0xC3, 0x75, 0x9D, 0x08, 0xCC, 0xBA, 0x20, 0xD2, 0x55, 0x1E, 0x57, 0x6F, 0x56, 0x5A
        }, {
            0xEE, 0xA8, 0xD3, 0xA9, 0x06, 0x96, 0xF2, 0x41, 0x03, 0x80, 0x79, 0x75, 0xCA, 0x1A, 0xFC, 0x57, 0xA4, 0xD7, 0xE3, 0x30, 0xE1, 0x5B, 0xC1, 0x6D, 0x89, 0xF2, 0xC1, 0x54, 0x45, 0x5E, 0x6D, 0x06, 0xC3, 0x58, 0xD0, 0xD2, 0x9B, 0x60, 0xA1, 0x1A, 0xDF, 0xD6, 0xA4, 0x44, 0x4E, 0xD0, 0x46, 0x06, 0x11, 0xB3, 0x18, 0xF0, 0x72, 0x28, 0xE4, 0x26, 0x48, 0x87, 0x8E, 0xAB, 0x41, 0xCF, 0xB2, 0x4D
        }, {
            0x69, 0x19, 0x5E, 0xED, 0xEB, 0xE5, 0xA0, 0xED, 0x0F, 0xC9, 0x8B, 0xE5, 0xC5, 0x77, 0xCD, 0x0D, 0x50, 0xC6, 0xA7, 0xBA, 0x78, 0x41, 0x8A, 0x53, 0xBF, 0xEF, 0x1E, 0x53, 0xBC, 0x0A, 0x5A, 0xA0, 0x2A, 0x3E, 0x12, 0x5A, 0x40, 0xA4, 0x2E, 0x04, 0x9D, 0x13, 0xBE, 0x6A, 0xA6, 0x1C, 0xA3, 0x6E, 0x78, 0x00, 0x0B, 0x57, 0xC6, 0x3E, 0x2C, 0xAD, 0xEE, 0x71, 0x86, 0xC7, 0x5C, 0xD5, 0x44, 0xF9
        }, {
            0x49, 0xDA, 0xED, 0x7A, 0x1E, 0xF4, 0x8B, 0x64, 0x57, 0xBF, 0x68, 0x9C, 0x28, 0xF4, 0x75, 0x8A, 0x7C, 0x98, 0x04, 0xC7, 0xA2, 0xB7, 0xAB, 0xF2, 0x4D, 0x6E, 0x8D, 0x2B, 0xB6, 0xFE, 0x25, 0x84, 0x20, 0x40, 0x3F, 0xE1, 0x32, 0xDC, 0x76, 0x33, 0x0A, 0x7E, 0x5E, 0x08, 0x2F, 0x37, 0x2D, 0xEF, 0xC8, 0x7B, 0xC5, 0xC4, 0xE1, 0x36, 0x4F, 0xD2, 0x31, 0xEC, 0x58, 0xF8, 0xA7, 0xDC, 0x84, 0x4A
        }, {
            0x1E, 0xF7, 0x46, 0x7E, 0xC3, 0xC6, 0xB7, 0x43, 0x63, 0x38, 0x74, 0xFE, 0x23, 0x44, 0x62, 0x28, 0xEE, 0x36, 0xDD, 0xD0, 0x27, 0x93, 0x59, 0x4B, 0x05, 0xD2, 0x7D, 0xC5, 0x6C, 0x0F, 0x32, 0x1E, 0xA5, 0xB7, 0xAB, 0x02, 0xA9, 0xE5, 0xFC, 0x68, 0x6A, 0x41, 0xB4, 0x92, 0x51, 0xAD, 0x1B, 0xCE, 0xFA, 0xD9, 0xFC, 0x9B, 0x2B, 0x56, 0x57, 0x94, 0x67, 0x13, 0xE6, 0xDF, 0x00, 0xA0, 0xD3, 0x2D
        }, {
            0xD8, 0x2D, 0x06, 0x63, 0x3C, 0xBC, 0xFC, 0x85, 0x35, 0xFA, 0x1B, 0xF8, 0xFB, 0xB8, 0xAD, 0x67, 0xC9, 0x57, 0xF7, 0x90, 0x37, 0xED, 0x6E, 0xDD, 0x0A, 0x19, 0x0C, 0xCD, 0x7F, 0x29, 0x5B, 0xC0, 0x4A, 0x45, 0x0E, 0x11, 0xF2, 0x7D, 0x1E, 0x2F, 0xFC, 0x34, 0xA8, 0xCC, 0x9F, 0xC9, 0x7D, 0xAE, 0x94, 0xAC, 0xC9, 0xC9, 0x52, 0x9E, 0x4E, 0x64, 0x89, 0x6D, 0x9D, 0xFE, 0x3B, 0xC7, 0x27, 0xC1
        }, {
            0x7B, 0x97, 0x18, 0x24, 0xF6, 0xCD, 0x13, 0xBB, 0x32, 0xFF, 0x79, 0x84, 0x6E, 0x56, 0x32, 0x62, 0x64, 0x9A, 0xE7, 0x38, 0xC1, 0x9E, 0xC8, 0x5B, 0x51, 0x77, 0x55, 0xC0, 0xDC, 0x24, 0x4B, 0x68, 0x5F, 0xC6, 0xA7, 0x51, 0xAA, 0x77, 0x0F, 0x29, 0x81, 0x98, 0x20, 0xF2, 0xB7, 0x00, 0x8B, 0xA7, 0xC1, 0x23, 0x33, 0x3A, 0x09, 0xDA, 0xE0, 0x2C, 0x97, 0x84, 0x37, 0xED, 0x0F, 0x5E, 0xD4, 0x81
        }, {
            0xC1, 0x01, 0xD9, 0x78, 0xF2, 0x20, 0x2F, 0x9C, 0x2D, 0x76, 0x4A, 0x42, 0x7E, 0x44, 0xB0, 0x21, 0xD8, 0xAD, 0x77, 0x6F, 0x13, 0x01, 0xAA, 0x04, 0x0A, 0x87, 0x7C, 0xF0, 0x44, 0x0C, 0x68, 0xFF, 0x1D, 0x80, 0x19, 0xC0, 0xCC, 0x0E, 0xFE, 0x32, 0x65, 0x6B, 0xA3, 0x03, 0xE7, 0x80, 0x5B, 0x00, 0x82, 0x66, 0xCA, 0x3C, 0x09, 0xF1, 0xF6, 0xEC, 0x5B, 0xB3, 0xFA, 0xAC, 0xF5, 0xEE, 0xE2, 0x7C
        }, {
            0x3F, 0x52, 0x71, 0xBA, 0xC2, 0x81, 0x92, 0xBC, 0x42, 0x3E, 0x29, 0xD0, 0x06, 0x27, 0xBD, 0x0D, 0x2F, 0x95, 0x56, 0xB1, 0xE5, 0xF1, 0x7F, 0x58, 0x75, 0xAE, 0x64, 0x08, 0x7D, 0x53, 0x7E, 0x94, 0x76, 0x5D, 0x2B, 0xFE, 0xEE, 0xA7, 0x09, 0x6D, 0xC2, 0x36, 0xDA, 0x3E, 0xA6, 0x3D, 0x42, 0xC0, 0xD5, 0x11, 0x39, 0xA2, 0xD3, 0xBA, 0x08, 0x99, 0x78, 0xD0, 0xDF, 0xC2, 0x6C, 0x48, 0xDF, 0xB9
        }, {
            0x73, 0x36, 0x60, 0x54, 0x54, 0xF0, 0x4C, 0x2D, 0xCF, 0xDB, 0x3B, 0x4C, 0xD6, 0xED, 0xFD, 0xA4, 0x6E, 0x20, 0xCA, 0x1D, 0x1B, 0x3E, 0x49, 0xF5, 0xD0, 0x20, 0x7E, 0xE8, 0x15, 0xE8, 0x25, 0x30, 0x97, 0x77, 0x64, 0xF6, 0x1D, 0x0D, 0x67, 0x8D, 0xED, 0x25, 0x86, 0x54, 0xB5, 0xA7, 0x39, 0x08, 0xB5, 0xD1, 0xA9, 0x53, 0x4D, 0x87, 0x09, 0xB5, 0x61, 0xFE, 0x37, 0x84, 0x91, 0x24, 0x6F, 0x82
        }
    };

    public static int[][] E = {
        {
            0x56, 0x6D, 0x56, 0x03, 0x87, 0x86, 0x81, 0x5D, 0xFC, 0x3F, 0xFC, 0x67, 0xBB, 0x6B, 0xE6, 0xB4, 0x03, 0x1A, 0x7E, 0x63, 0x8E, 0x42, 0x0F, 0xF2, 0xF6, 0xF7, 0x81, 0xF5, 0xAC, 0x24, 0x77, 0xA4, 0x4C, 0x31, 0x6B, 0x0F, 0x5F, 0x89, 0xF3, 0x3E, 0x7B, 0xD6, 0xCA, 0x66, 0xFA, 0xF9, 0x4F, 0x9D, 0x10, 0xDB, 0xB7, 0xF3, 0x36, 0x42, 0x76, 0x22, 0xDA, 0xB4, 0xC0, 0x59, 0xA0, 0x50, 0x07, 0xB3
        }, {
            0xDB, 0xBD, 0xA9, 0x6A, 0xA7, 0x61, 0x9D, 0x88, 0x33, 0xCB, 0xD6, 0x14, 0xE4, 0xCC, 0xCD, 0x7B, 0xCC, 0xCD, 0x0F, 0xAE, 0x37, 0xAE, 0x04, 0xBD, 0xAF, 0x3A, 0xD6, 0x89, 0x2B, 0x18, 0x06, 0xA8, 0x8B, 0xC6, 0xEF, 0x9F, 0xF4, 0x3C, 0x1D, 0xA8, 0x39, 0xD2, 0x96, 0x51, 0xA2, 0xB3, 0x3B, 0x11, 0x32, 0x78, 0x3D, 0xEE, 0x6B, 0x9B, 0xDA, 0x2D, 0x6D, 0xCE, 0x52, 0x88, 0x39, 0x96, 0x3A, 0x90
        }
    };

    public static int[][][] gN = {{
        {
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00
        }, {
            0x20, 0x3C, 0xC1, 0x5D, 0xD5, 0x5F, 0xCA, 0xA5, 0xB7, 0xA3, 0xBD, 0x98, 0xFB, 0x24, 0x08, 0xA6, 0x7D, 0x5B, 0x9F, 0x33, 0xA8, 0x0B, 0xB5, 0x05, 0x40, 0x85, 0x2B, 0x20, 0x42, 0x65, 0xA2, 0xC1, 0xAA, 0xCA, 0x5E, 0xFE, 0x1D, 0x8D, 0x51, 0xB2, 0xE1, 0x63, 0x6E, 0x34, 0xF5, 0xBE, 0xCC, 0x07, 0x7D, 0x93, 0x01, 0x14, 0xFE, 0xFA, 0xF1, 0x76, 0xB6, 0x9C, 0x15, 0xAD, 0x8F, 0x2B, 0x68, 0x78
        }, {
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0xFB, 0xE2, 0xE5, 0xF0, 0xEE, 0xE3, 0xC8, 0x20
        }, {
            0xA6, 0x90, 0x49, 0xE7, 0xBD, 0x07, 0x6A, 0xB7, 0x75, 0xBC, 0x28, 0x73, 0xAF, 0x26, 0xF0, 0x98, 0xC5, 0x38, 0xB1, 0x7E, 0x39, 0xA5, 0xC0, 0x27, 0xD5, 0x32, 0xF0, 0xA2, 0xB3, 0xB5, 0x64, 0x26, 0xC9, 0x6B, 0x28, 0x5F, 0xA2, 0x97, 0xB9, 0xD3, 0x9A, 0xE6, 0xAF, 0xD8, 0xB9, 0x00, 0x1D, 0x97, 0xBB, 0x71, 0x8A, 0x65, 0xFC, 0xC5, 0x3C, 0x41, 0xB4, 0xEB, 0xF4, 0x99, 0x1A, 0x61, 0x72, 0x27
        }
    }, {
        {
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
        }, {
            0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01
        }, {
            0x01, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30
        }, {
            0xE3, 0xBB, 0xAD, 0xBF, 0x78, 0xAF, 0x32, 0x64, 0xC9, 0x13, 0x71, 0x27, 0x60, 0x8A, 0xA5, 0x10, 0xDE, 0x90, 0xBA, 0x4D, 0x30, 0x75, 0x66, 0x58, 0x44, 0x96, 0x5F, 0xB6, 0x11, 0xDB, 0xB1, 0x99, 0x8D, 0x48, 0x55, 0x2A, 0x0C, 0x0C, 0xE6, 0xBC, 0xBA, 0x71, 0xBC, 0x80, 0x2A, 0x4F, 0x5B, 0x2D, 0x2A, 0x07, 0xB1, 0x2C, 0x22, 0xE2, 0x57, 0x94, 0x17, 0x85, 0x70, 0x34, 0x10, 0x96, 0xFD, 0xC7
        }
    }};
    
    public static int[] SHORT_MSG = {0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37
             , 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31
             , 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35
             , 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30};
    
    public static int[] SHORT_HASH512 = {
	0x48, 0x6F, 0x64, 0xC1, 0x91, 0x78, 0x79, 0x41, 0x7F, 0xEF, 0x08, 0x2B, 0x33, 0x81, 0xA4, 0xE2
	,0x11, 0xC3, 0x24, 0xF0, 0x74, 0x65, 0x4C, 0x38, 0x82, 0x3A, 0x7B, 0x76, 0xF8, 0x30, 0xAD, 0x00
	,0xFA, 0x1F, 0xBA, 0xE4, 0x2B, 0x12, 0x85, 0xC0, 0x35, 0x2F, 0x22, 0x75, 0x24, 0xBC, 0x9A, 0xB1
	,0x62, 0x54, 0x28, 0x8D, 0xD6, 0x86, 0x3D, 0xCC, 0xD5, 0xB9, 0xF5, 0x4A, 0x1A, 0xD0, 0x54, 0x1B
};
    
    public static int[] LONG_MSG = {0xFB, 0xE2, 0xE5, 0xF0, 0xEE, 0xE3, 0xC8, 0x20, 0xFB, 0xEA
            , 0xFA, 0xEB, 0xEF, 0x20, 0xFF, 0xFB, 0xF0, 0xE1, 0xE0, 0xF0, 0xF5, 0x20, 0xE0, 0xED
            , 0x20, 0xE8, 0xEC, 0xE0, 0xEB, 0xE5, 0xF0, 0xF2, 0xF1, 0x20, 0xFF, 0xF0, 0xEE, 0xEC
            , 0x20, 0xF1, 0x20, 0xFA, 0xF2, 0xFE, 0xE5, 0xE2, 0x20, 0x2C, 0xE8, 0xF6, 0xF3, 0xED
            , 0xE2, 0x20, 0xE8, 0xE6, 0xEE
            , 0xE1, 0xE8, 0xF0, 0xF2, 0xD1, 0x20, 0x2C, 0xE8, 0xF0
            , 0xF2, 0xE5, 0xE2, 0x20, 0xE5, 0xD1};
    
    public static int[] LONG_HASH512 = {
	0x28, 0xFB, 0xC9, 0xBA, 0xDA, 0x03, 0x3B, 0x14, 0x60, 0x64, 0x2B, 0xDC, 0xDD, 0xB9, 0x0C, 0x3F
	,0xB3, 0xE5, 0x6C, 0x49, 0x7C, 0xCD, 0x0F, 0x62, 0xB8, 0xA2, 0xAD, 0x49, 0x35, 0xE8, 0x5F, 0x03
	,0x76, 0x13, 0x96, 0x6D, 0xE4, 0xEE, 0x00, 0x53, 0x1A, 0xE6, 0x0F, 0x3B, 0x5A, 0x47, 0xF8, 0xDA
	,0xE0, 0x69, 0x15, 0xD5, 0xF2, 0xF1, 0x94, 0x99, 0x6F, 0xCA, 0xBF, 0x26, 0x22, 0xE6, 0x88, 0x1E
};

}
