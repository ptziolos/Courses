/** @type {import('tailwindcss').Config} */
/*https://github.com/tailwindlabs/tailwindcss/blob/v2.2.19/stubs/defaultConfig.stub.js*/
//eslint-disable-next-line
export default {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    fontFamily: {
      sans: "Roboto Mono, monospace",
    },
    extend: {
      height: {
        screen: "100dvh",
      },
    },
  },
  plugins: [],
};
