import { useTheme } from './ThemeContext';

function Home() {
  const { theme, toggleTheme } = useTheme();

  return (
    <div
      style={{
        background: theme === 'dark' ? '#222' : '#fff',
        color: theme === 'dark' ? '#fff' : '#000',
        padding: '2rem',
        textAlign: 'center',
      }}
    >
      <h1>{theme.toUpperCase()} MODE</h1>
      <button onClick={toggleTheme}>Toggle Theme</button>
    </div>
  );
}

export default Home;
